public class AddBinary {
	/// (ㄒoㄒ)/~~不超过int型的范围的二进制数加法
	public static String addBinary(String a, String b) {
		String results = "";
		int A,B,carry = 0;
		int sizeA = a.length(), sizeB = b.length();
		//a和b位数对齐
		if(sizeA > sizeB){
			for(int i = 0; i < sizeA - sizeB; i++){
				b = '0' + b;
			}
		}else if(sizeA < sizeB){
			for(int i = 0; i < sizeB - sizeA; i++){
				a = '0' + a;
			}
		}
		sizeA = a.length();
		for(int i = sizeA - 1; i >= 0; i--){
		A = a.charAt(i) - 48;
		B = b.charAt(i) - 48;
		if(A + B + carry == 0){
			results = '0' +results;
			carry = 0;
		}else if(A + B + carry == 1){
			results = '1' +results;
			carry = 0;
		}else if(A + B + carry == 2){
			results = '0' +results;
			carry = 1;
		}else if(A + B + carry == 3){
			results = '1' +results;
			carry = 1;
		}
	}
		if(carry == 1)
			results = '1' + results;

		return results;
	}

	public static void main(String[] args) {
		String str = addBinary("1100", "10101010");
		System.out.println(str);
//		String a = "10";
//		int h = a.charAt(1) - 48;
//		System.out.println(h);

	}

//	for(int i = sizeA - 1; i < sizeA; i++){
//	A = a.charAt(i) - 48;
//	B = b.charAt(i) - 48;
//	System.out.println(A);
//	if(A + B + carry == 0){
//		results += '0' ;
//		carry = 0;
//	}else if(A + B + carry == 1){
//		results += '1';
//		carry = 0;
//	}else if(A + B + carry == 2){
//		results += '0';
//		carry = 1;
//	}else if(A + B + carry == 3){
//		results += '1' ;
//		carry = 1;
//	}
//}

}