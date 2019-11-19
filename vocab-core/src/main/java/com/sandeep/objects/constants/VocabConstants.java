package com.sandeep.objects.constants;

public class VocabConstants {

	/**
	 * Error code of com.vocab.service start with 20x
	 */
	public static class ApiReponseCode {

		public static final String INVAILD_DATA = "401";
		public static final String SUCCESS      = "200";


	}

	public static class ApiReponseMessage {

		public static final String SUCCESS      = "SUCCESS";
	}

	public static final String EMAIL_REGEX ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

}
