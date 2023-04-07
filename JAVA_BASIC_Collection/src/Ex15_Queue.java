import java.util.LinkedList;
import java.util.Queue;

import kr.or.kosa.Message;

public class Ex15_Queue {

	public static void main(String[] args) {
		Queue<Message> messageQueue =  new LinkedList<>();
		
		// 메세지를 보낸다.

		// 홍길동, 홍길서, 홍길남에게 순서대로 보낸다.

		
		messageQueue.offer(new Message("sendMail","홍길동"));

		messageQueue.offer(new Message("sendSMS","홍길서"));

		messageQueue.offer(new Message("sendKakaotalk","홍길남"));

		while(!messageQueue.isEmpty()){

			Message message = messageQueue.poll();  //ArrayList의 참조주소.get(i)와 같은 기능[객체값 호출]

			switch(message.command){
	
				case "sendMail" :
		
					System.out.println(message.to + "님에게 메일을 보냅니다.");
		
					break;
		
				case "sendSMS" :
		
					System.out.println(message.to + "님에게 SMS을 보냅니다.");
		
					break;
		
				case "sendKakaotalk" :
		
					System.out.println(message.to + "님에게 카톡을 보냅니다.");
		
					break;

				}

		}



	
			

	}

}
