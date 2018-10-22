package com.rograndec.feijiayun.chain.common.constant;

/**
 * 医保类别
 * @ClassName: MedicalInsuranceType
 * @Description: TODO(描述该类做什么)
 * @author liuqun
 * @version 1.0 
 * @date 2017年9月12日 上午11:35:48
 */
public enum MedicalInsuranceType {

	MEDICAL_NO(0,"国家医保"),
	MEDICAL_YES(1,"地方医保");

	private int code;
    private String name;

    private MedicalInsuranceType(int code, String name) {
		this.code = code;
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setType(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static String getName(int code) {  
        for (MedicalInsuranceType c : MedicalInsuranceType.values()) {
            if (c.getCode() == code) {  
                return c.getName();  
            }  
        }  
        return null;  
    }

	public static int getCode(String name) {
		for (MedicalInsuranceType c : MedicalInsuranceType.values()) {
			if (name.equals(c.getName())) {
				return c.getCode();
			}
		}
		return -1;
	}
	
}
