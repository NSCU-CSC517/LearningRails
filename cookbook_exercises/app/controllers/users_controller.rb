class UsersController < ApplicationController
  before_action :set_user, only: [:show, :edit, :update, :destroy]
  before_action :logged_in,:editable_user, only: [:edit, :update]
  before_action :logged_in_as_admin,:admin_cannot_be_delete, only: [:destroy]

  # GET /users
  def index
    @users = User.all
  end

  # GET /users/1
  def show
  end

  # GET /users/new
  def new
    @user = User.new
  end

  # GET /users/1/edit
  def edit
  end

  # POST /users
  def create
    @user = User.new(user_params)

    if @user.save
      session[:current_user_id]=@user.id
      redirect_to @user, notice: 'User was successfully created.'
    else
      render :new
    end
  end

  # PATCH/PUT /users/1
  def update
    if @user.update(user_params)
      redirect_to @user, notice: 'User was successfully updated.'
    else
      render :edit
    end
  end

  # DELETE /users/1
  def destroy
    @user.destroy
    redirect_to users_url, notice: 'User was successfully destroyed.'
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_user
      @user = User.find(params[:id])
    end

    # Only allow a trusted parameter "white list" through.
    def user_params
      params.require(:user).permit(:name, :email, :password, :password_confirmation)
    end

    def editable_user
      unless User.find(params[:id])==current_user||current_user.admin?
        redirect_to root_url, notice: 'Non editable user!'
      end
    end


  def admin_cannot_be_delete
      if User.find(params[:id])==current_user && current_user.admin?
        redirect_to root_url, notice: 'Admin cannot be deleted!'
      end
    end

end
