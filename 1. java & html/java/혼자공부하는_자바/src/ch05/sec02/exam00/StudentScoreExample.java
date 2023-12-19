package ch05.sec02.exam00;

public class StudentScoreExample {

	public static void main(String[] args) {
		/*
		 * 학생 5명이 있습니다.
		 * {"홍길동", "홍이동", "홍삼동", "홍사동", "홍오동"}
		 * 이 학생들의 성적을 관리하는 관리프로그램을 만들려고 합니다.
		 * 
		 * 문제1>
		 * 학생의 리스트를 '대표변수'를 이용하여 학생의 이름을 출력하세요.
		 */
		String[] studentName = new String[5];	//배열의 선언
		//studentNmae = {"홍길동", "홍이동", "홍삼동", "홍사동", "홍오동"};  //초기화는 선언할 때 한다
																		//아니라면 new 사용하여 새로.
		studentName = new String[] {"홍길동", "홍이동", "홍삼동", "홍사동", "홍오동\n"};
		
		/*
		 * 문제2>
		 * 각 학생의 국어 점수는 다음과 같다
		 * 홍길동 : 90점, 홍이동 : 85점, 홍상돔 : 93점, 홍사동 : 95점, 홍오동 : 87점
		 * 국어과목의 총점을 구하고 평균점을 구하시오
		 * 가장 높은 국어점수와 가장 낮은 국어점수를 구하시오
		 * 가장 높은 국어점수를 기록한 학생이름은 누구입니까?
		 */
		int[] kor = new int[5];
		kor = new int[] {90, 85, 93, 95, 87};
		
		for(int i=0; i<5; i++) {
			System.out.print(studentName[i] + " : " +  kor[i] + "\n");
		}
		
		int totalKor = 0;
		int maxKor = -1;		//나올 수 없는 점수(인덱스)로 초기설정하여
		int maxIndex= -1;		//  아직 비교하지 않았음을 의미
		int minKor = 101;		//
		int minIndex= -1;		//
		
		for(int i=0; i<5; i++) {
			totalKor += kor[i];		//총점
			//max
			if(kor[i] > maxKor) {		
				maxKor = kor[i];		//maxscore
				maxIndex = i;				//maxindex
			}
			//min
			if(kor[i] < minKor) {
				minKor = kor[i];		//minscore
				minIndex = i;				//minindex
			}
		}
		double avgKor = (double)totalKor / kor.length;	//평균
		System.out.println();
		//출력문 1)
		System.out.println("국어 점수 \n총점 : " + totalKor + ", 평균 : " + avgKor);
		System.out.println("최고점 : " + kor[maxIndex] + ", 최고점자 : " + studentName[maxIndex]);
		System.out.println("최저점 : " + kor[minIndex] + ", 최저점자 : " + studentName[minIndex]);	
		System.out.println();
		
		//출력문 2)
		  String msg = """
		  		총점 : $total
		  		평균 : $avg
		  		최고점수 : $maxScore
		  		최고점수 학생 : $maxStudent
		  		최저점수 : $minScore
		  		최저점수 학생 : $minStudent
		  		""";
		   //chaining 패턴
		  msg = msg.replace("$total", "" + totalKor)			// "" : 문자열 연산으로 바꿔주기 위해 사용
		       .replace("$avg", "" + avgKor)
		       .replace("$maxScore", "" + maxKor)
		       .replace("$maxStudent", "" + studentName[maxIndex])
		       .replace("$minScore", "" + minKor)
		       .replace("$minStudent", "" + studentName[minIndex]);
		System.out.println(msg);
	}
	
}

/*
 * max or min 점수가 같은 학생이 둘 이상이라면???
 * 1)
 * System.out.print("최고점자 : ");
 * for(int i = 0; i <5; i++){
 *     if(kor[i] == maxKor){
 *         System.out.print(studentName[i]+ " ");
 *         }
 * }
 * 2)min[], max[] 사용
 * 
 */