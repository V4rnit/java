public class PasswordBacktracking {

    // Allowed characters
    static char[] chars = {'0', '1'};  // you can change this to 'a','b','c', etc.

    public static void main(String[] args) {
        int passwordLength = 3; // desired length of password
        char[] password = new char[passwordLength]; // temporary array to build passwords
        generatePassword(password, 0);
    }

    // Recursive backtracking function
    public static void generatePassword(char[] password, int position) {
	    if(password.length == position){
		    System.out.println(new String(password));
		    return;
	    }
	    for(char c : chars){
		    password[position] = c;
		    generatePassword(password, position + 1);
	    }
    }
}
