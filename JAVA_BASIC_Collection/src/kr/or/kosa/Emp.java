package kr.or.kosa;

//한건의 데이터를 담을 수 있는 클래스

//데이터베이스의 테이블과 1:1 매핑 하는 클래스
//create table emp( empno number , ename varchar2(30));
//select * from emp where empno = 7902
//DTO, VO, DOMAIN
public class Emp {
	private int empno;
	private String ename;
	private String job;
	
	
	public Emp(int empno, String ename,String job) { //오버로딩된 생성자를 만들어준다.
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}


	public int getEmpno() {
		return empno;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void empInfoPrint() {
		System.out.println(this.empno + "-" + this.ename);
	}


	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + "]";
	}

	//Object toString () 주소값 반화
	//재정의를 통해서 인스턴스 멤버 [필드들의 값]을 확인하는 용도로 사용

	
	

}
