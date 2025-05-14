import java.util.Scanner;
public class OTPMethod {
	public boolean otpCheck() {
		int[] arr = new int[10];
		for(int i=0; i<10; i++){
			arr[i]= (int) ((Math.random()) * 900000)+100000;
		}
		for(int i=0; i<10; i++){
				for(int j=i+1; j<10; j++){
					if(arr[i]==arr[j]){
						return true;
					}
				}
		}
		return false;
	}
	public static void main(String[] args){
		OTPMethod obj = new OTPMethod();
		boolean result = obj.otpCheck();
		if(result){
			System.out.println("Numbers are not unique");
		}
		else{
			System.out.println("Numbers are unique");
		}
	}
}