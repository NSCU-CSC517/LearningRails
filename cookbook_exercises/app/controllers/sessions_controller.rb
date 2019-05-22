class SessionsController < ApplicationController
  def new
  end
  def create
    user = User.find_by(email: params[:session][:email].downcase)
    if user && user.authenticate(params[:session][:password])
      # successfully log in
      session[:current_user_id]=user.id
      redirect_to user
    else
      # unsuccessfully log in
      redirect_to login_url, notice: 'Invalid email/password combination!'
    end
  end
  def destroy
    session.delete(:current_user_id)
    @current_user = nil
    redirect_to root_url
  end

end
