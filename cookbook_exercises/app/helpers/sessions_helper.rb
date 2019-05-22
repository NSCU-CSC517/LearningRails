module SessionsHelper
  def current_user
    @current_user=@current_user||User.find_by(id:session[:current_user_id])
  end
  def logged_in
    if current_user==nil
      redirect_to login_url, notice: 'Please log in first!'
    end
  end
  def logged_in_as_admin
    unless current_user && current_user.admin?
      redirect_to root_url, notice: "Forbidden action!"
    end
  end
end
