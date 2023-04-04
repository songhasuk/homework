package kr.or.kosa.dto;

//한건의 데이터를 담을 수 있는 클래스

//데이터베이스의 테이블과 1:1 매핑 하는 클래스
//create table emp( empno number , ename varchar2(30));
//select * from emp where empno = 7902
//DTO, VO, DOMAIN
public class Emp {
	private int empno;
	private String ename;
	
	
	public Emp(int empno, String ename) { //오버로딩된 생성자를 만들어준다.
		super();
		this.empno = empno;
		this.ename = ename;
	}


	public int getEmpno() {
		return empno;
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

}
