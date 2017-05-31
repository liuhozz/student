package com.heima.ssh.enty;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	/**
	 * 
	FieldTypeComment
	cust_id   
	cust_name 
	cust_source 
	cust_industry
	cust_level 
	cust_phone 
	cust_mobile
	 */
	private Long cust_id;
	private String cust_name;
	
	private DaseDict daseDictSource;
	private DaseDict daseDictIndustry;
	private DaseDict daseDictLevel;
	
	private String cust_phone;
	private String cust_mobile;
	
	private Set<LinkMan> linkMans=new HashSet<LinkMan>();

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long cust_id, String cust_name, DaseDict daseDictSource, DaseDict daseDictIndustry,
			DaseDict daseDictLevel, String cust_phone, String cust_mobile, Set<LinkMan> linkMans) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.daseDictSource = daseDictSource;
		this.daseDictIndustry = daseDictIndustry;
		this.daseDictLevel = daseDictLevel;
		this.cust_phone = cust_phone;
		this.cust_mobile = cust_mobile;
		this.linkMans = linkMans;
	}

	/**
	 * @return the cust_id
	 */
	public Long getCust_id() {
		return cust_id;
	}

	/**
	 * @param cust_id the cust_id to set
	 */
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}

	/**
	 * @return the cust_name
	 */
	public String getCust_name() {
		return cust_name;
	}

	/**
	 * @param cust_name the cust_name to set
	 */
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	/**
	 * @return the daseDictSource
	 */
	public DaseDict getDaseDictSource() {
		return daseDictSource;
	}

	/**
	 * @param daseDictSource the daseDictSource to set
	 */
	public void setDaseDictSource(DaseDict daseDictSource) {
		this.daseDictSource = daseDictSource;
	}

	/**
	 * @return the daseDictIndustry
	 */
	public DaseDict getDaseDictIndustry() {
		return daseDictIndustry;
	}

	/**
	 * @param daseDictIndustry the daseDictIndustry to set
	 */
	public void setDaseDictIndustry(DaseDict daseDictIndustry) {
		this.daseDictIndustry = daseDictIndustry;
	}

	/**
	 * @return the daseDictLevel
	 */
	public DaseDict getDaseDictLevel() {
		return daseDictLevel;
	}

	/**
	 * @param daseDictLevel the daseDictLevel to set
	 */
	public void setDaseDictLevel(DaseDict daseDictLevel) {
		this.daseDictLevel = daseDictLevel;
	}

	/**
	 * @return the cust_phone
	 */
	public String getCust_phone() {
		return cust_phone;
	}

	/**
	 * @param cust_phone the cust_phone to set
	 */
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}

	/**
	 * @return the cust_mobile
	 */
	public String getCust_mobile() {
		return cust_mobile;
	}

	/**
	 * @param cust_mobile the cust_mobile to set
	 */
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}

	/**
	 * @return the linkMans
	 */
	public Set<LinkMan> getLinkMans() {
		return linkMans;
	}

	/**
	 * @param linkMans the linkMans to set
	 */
	public void setLinkMans(Set<LinkMan> linkMans) {
		this.linkMans = linkMans;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", daseDictSource=" + daseDictSource
				+ ", daseDictIndustry=" + daseDictIndustry + ", daseDictLevel=" + daseDictLevel + ", cust_phone="
				+ cust_phone + ", cust_mobile=" + cust_mobile + "]";
	}

	
	
	
	
	
}
