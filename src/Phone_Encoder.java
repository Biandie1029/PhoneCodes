import java.util.Scanner;
public class Phone_Encoder {
    private static final Scanner keyboard = new Scanner (System.in);
    private static final int MIN_INPUT_VALUE = 999999;
    private static final int MAX_INPUT_VALUE = 9999999;
    public static void main(String[] args) {
        int phone_number;
        do{
            System.out.println("Enter your 305 phone number: ");
            phone_number = keyboard.nextInt();
        }while (phone_number < MIN_INPUT_VALUE || phone_number > MAX_INPUT_VALUE);
        String encoded_phone_number = EncodeNumber(phone_number);
        System.out.println("Encoded 7 digits: " + encoded_phone_number);
        String encoded305 = EncodeNumber(305);
        String final_code = encoded305 + encoded_phone_number;
        System.out.println("Final encoded number: " + final_code);
    }
        private static String EncodeNumber (int user_input){
            String result = "";
            char [] Encoding_Letters = {'0','1','A','D','G','J','M','P','T','W'};
            int [] Number_Options = {1, 1, 3, 3, 3, 3, 3, 4, 3, 4,};

            int digit;
            while (user_input > 0){
                digit = user_input % 10;
                int Number_Choices = (int) Math.floor(Math.random() * Number_Options[digit]);
                char Encoded_Character = (char)(Encoding_Letters[digit] + Number_Choices);
                result = Encoded_Character + result;
                user_input = user_input / 10;
            }
            return result;
        }
    }
