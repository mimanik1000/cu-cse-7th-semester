package as.ag;

public class User {
		
		private String userid;
		private String pasword;
		/**
		 * @param userid
		 * @param pasword
		 */
		public User(String userid, String pasword) {
			super();
			this.userid = userid;
			this.pasword = pasword;
		}
		/**
		 * @return the userid
		 */
		public String getUserid() {
			return userid;
		}
		/**
		 * @param userid the userid to set
		 */
		public void setUserid(String userid) {
			this.userid = userid;
		}
		/**
		 * @return the password
		 */
		public String getPasword() {
			return pasword;
		}
		/**
		 * @param pasword the password to set
		 */
		public void setPasword(String pasword) {
			this.pasword = pasword;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		
}
