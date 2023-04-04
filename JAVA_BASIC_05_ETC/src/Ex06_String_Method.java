import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat(" world");  // str변수의 값과 결합시키는 concat()메소드
		
		System.out.println(concatstr);
		
		
		boolean bo =  str.contains("ello");  
		// .contains() : 인수값을 넣어서 해당 문자열값이 똑같이 들어가 있는지를 체크해주는 함수
		System.out.println(bo);
		
		String str2 = "a b c d";  //[a][][b][][c][d];  ==> 메모리상에서
		System.out.println(str2.length());
		
		//공백도 문자로 처리된다.
		
		String filename = "hello java world";
		System.out.println(filename.indexOf("e"));
		System.out.println(filename.indexOf("java"));
		System.out.println(filename.indexOf("개폭망")); //값이 없으면 -1을 출력
		//indexOf() : 해당 문자가 [시작하는 위치]를 알려준다.
		//신문사설 원하는 검색 ... 내가원하는 던아가 있는지를 확인
		
		if(filename.indexOf("wo") != -1) {
			
			System.out.println("wo 단어가 하나라도 있다");
		}
		
		//filename.indexOf("wo") != -1  : 해당 단어가 있냐 없냐는 찾는 조건
		
		System.out.println(filename.lastIndexOf("a"));
		//문자열 맨뒤자리부터 해당 단어가 어디에 위치해 있는지 찾아준다.
		
		//LENGTH(), indexOf(), substring(), replace(), split()
		
		String result = "superman";
		System.out.println(result.substring(0)); //superman 시작 
		System.out.println(result.substring(1)); //uperman 
		System.out.println(result.substring(1, 2));
		
		/*
		beginIndex the beginning index, inclusive.
		endIndex the ending index, exclusive.
		 */
		
		System.out.println(result.substring(0,1));
		System.out.println(result.substring(0,0));
		
		//Quiz
				String filename2 = "home.jpg"; //또는  h.jpeg , aaaaa.hwp 올 수 있어요
				//여기서 파일명과 확장자를 분리해서 출력
				//파일명 : home
				//확장자 : jpg
				//단 위에 배운 함수만 사용해서 출력하세요
				int position = filename2.indexOf(".");
				String file = filename2.substring(0,position);
				
				
				String extention2 = filename2.substring(++position);
				System.out.println(extention2);
				
			
				String extention =  filename2.substring(position, filename2.length());
				System.out.println(extention);
				
				System.out.println(position);
				System.out.println(file);
				
				//replace
				String str3 = "ABCDADDDDDDA";
				String result3 = str3.replace("DDDDD", "오늘은 화요일");
				System.out.println(result3);
				
				result3 = str3.replace("A", "a");
				System.out.println(result3);
				
				//ETC
				 System.out.println(str3.charAt(0));
				 System.out.println(str3.charAt(3));
				 System.out.println(str3.endsWith("DDDA")); //true
				 System.out.println(str3.equalsIgnoreCase("aBCDAdDDDDDA")); //대소문자 구별 없이 비교 
				 
				 //중요
				 
				 //Today Point
				 String  str4="슈퍼맨,팬티,노랑색,우하하,우하하";
				 String[] namearray = str4.split(",");
				 for(String s : namearray) {
					 System.out.println(s);
				 }
				 
				 	//정규표현식 일단 내일 시간상...
					 String str5="슈퍼맨.팬티.노랑색.우하하.우하하";
					 String[] namearray2 = str5.split(".");
					 //String[] namearray2 = str5.split("\\."); 
					
					for(String s : namearray2) {
						System.out.println(s);
					}
					
					/*
					IP 주소를 .(dot) 기준으로 나누는 예제입니다.
				    구분자를 지정하는 파라미터는 정규표현식이라서 .만 넣으면 원하시는대로 나오지 않습니다.
					정규표현식의 예약어라서 .(dot) 앞에 역슬래시(\)를 2개 넣어야 인식됩니다.
					*/
					String ipAddress = "110.20.0.255";
					String[] ips = ipAddress.split("\\.");
					for (int i = 0; i < ips.length; i++) {
						System.out.println("ips[" + i + "] = " + ips[i]);
					}

				// 출력
				//ips[0] = 110
				//ips[1] = 20
				//ips[2] = 0
				//ips[3] = 255	
					
				//정규표현식 (문자들을 조합해서 규칙을 만들고 : 그 규칙하고 데이터 비교해서 판단)
				//우편번호 : {\d3}-{\d3} >> 12-123 (false) , 123*123(false) , 111-111(true)
				//https://cafe.naver.com/erpzone/220
					
				//정규 표현식(java , javascript , Oracle , C#) 표준 
				//핸드폰 , 차량번호 , 도메인주소 , 이메일 정규표현으로 구현 >> 입력한 데이터 유효성 검증  
				 
				 String str6 = "a/b,c-d.f";
				 StringTokenizer sto = new StringTokenizer(str6, "/,-.");
				 //구분자를 복수로 넣게해주는 객체
				 
				 while(sto.hasMoreElements()) {
					 System.out.println(sto.nextToken());
				 }
				 
				 String str7 = "홍       길       동";
				 // 저장 ==> 공백제거  ==> "홍길동"
				 System.out.println(str7.replace(" ", ""));
				 
				 String str8 = "       홍길동         ";
				 System.out.println(">"+str8+"<");
				 System.out.println(">"+str8.trim()+"<");
				 
				 String str9 = "     홍    길     동      ";
				 String result5 = str8.trim();
				 result5 = result5.replace(" ", "");
				 System.out.println(result5);
				 
				 
				//여러개의 함수를 연결해서 (method chain)
				System.out.println(str8.replace(" ", "").trim().substring(2));
				
				//hint
				int sum = 0;
				String[] numarr = {"1", "2", "3", "4"};
				
				for(String s : numarr) {
					sum += Integer.parseInt(s);
				}
				
				System.out.println("sum : "+sum);
				
				
				 String jumin="123456-1234567";
				 
				 String[] result10 = jumin.split("-");
				 
				 int front = Integer.parseInt(result10[0]); //주민번호 앞자리
				 int back = Integer.parseInt(result10[1]); //주민번호 뒷자리

				 int sum2 = 0;
				 while(front != 0) {
				     sum2 += front % 10; //각 자리 수마다 더함
				     front /= 10;
				     System.out.println(sum2);
				 }

				 while(back != 0) {
				     sum2 += back % 10; //각 자리 수마다 더함
				     back /= 10;
				     System.out.println(sum2);
				 }

				 System.out.println(sum2);
				 
				 
				 

	}

}
