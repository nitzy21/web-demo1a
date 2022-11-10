package com.bootcamp.hr.entity;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private float salary;
    private int deptId;
    private String deptName;
    private String jobId;
    private String jobName;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String email, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
    }

    public Employee(int id, String firstName, String lastName, String email, float salary, int deptId, String deptName, String jobId, String jobName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.deptId = deptId;
        this.deptName = deptName;
        this.jobId = jobId;
        this.jobName = jobName;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return this.id * 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee otherEmployee = (Employee)obj;
        return this.id == otherEmployee.getId() && this.email.equals(otherEmployee.getEmail());
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s", this.id, this.firstName, this.lastName, this.email, this.salary);
    }
}
