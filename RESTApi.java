public interface RESTApi
{

	@FormUrlEncoded
	@POST("/login")
	public void logIn(@Field("username") username, @Field("password") password, @Field("dev_id") device, Callback<Response> callback);

	@FormUrlEncoded
	@POST("/transactions")
	public void getTransactions(@Field("token") token, @Field("acct_no") account, @Field("page") page, Callback<Response> callback);

	@FormUrlEncoded
	@POST("/transactions")
	public void getTransactions(@Field("token") token, @Field("acct_no") account, @Field("page") page, @Field("count") count, Callback<Response> callback);

	@FormUrlEncoded
	@POST("/payees")
	public void getPayees(@Field("token") token, Callback<Response> callback);

    @FormUrlEncoded
    @POST("/accounts")
    public void getAccounts(@Field("token") token, Callback<Response> callback);

    @FormUrlEncoded
    @POST("/transfer")
    public void doTransfer(@Field("token") token, @Field("acct_no") accFrom @Field("acct_to") accTo, @Field("amount") amount, Callback<Response> callback);
    	
    @FormUrlEncoded
    @POST("/payment")
    public void doPayment(@Field("token") token, @Field("acct_no") accFrom @Field("acct_to") accTo, @Field("amount") amount, @Field("reference") desc, Callback<Response> callback);

    @FormUrlEncoded
    @POST("/register")
    public void register(@Field("email") email, @Field("account") account, Callback<Response> callback)

}