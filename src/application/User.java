/**
 * 
 */
package application;

/**
 * @author Dell
 *
 */
// This super class User needs to be extended by the sub classes Admin and
// Investor

public class User {

	int userid;
	String uname;
	String userpswd;
	String useremail;

	public User(int userid, String uname, String userpswd, String useremail) {

		this.userid = userid;
		this.uname = uname;
		this.userpswd = userpswd;
		this.useremail = useremail;

	}

}
