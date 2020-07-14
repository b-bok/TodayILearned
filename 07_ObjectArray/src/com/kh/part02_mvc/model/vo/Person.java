package com.kh.part02_mvc.model.vo;

// Model : ������ ������ ���� ���
// vo(ValueObject) : ������ ���� ��� ���� �뵵�� Ŭ����
public class Person {

	private String name; // �̸�
	private int age; // ����
	private int wealth; // ���
	
	
	// �⺻ ������
	
	public Person() {}
	
	// �Ű� ���� ������
	
	public Person(String name, int age, int wealth) {
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	
	// setter/getter �޼ҵ�
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	public int getWealth() {
		return wealth;
	}
	
	// information �޼ҵ�
	
	public String information() {
		return "�̸� : " + name + ", ���� : " + age + ", ��� : " + wealth;
	}
}