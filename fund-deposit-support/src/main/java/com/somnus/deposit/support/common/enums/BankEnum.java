package com.somnus.deposit.support.common.enums;

public enum BankEnum {
	JSCB("00080034","江苏银行"), BOC("00080001","中国银行"), CMB("00080002","招商银行"), 
	
	ICBC("00080003","中国工商银行"), ABC("00080004","中国农业银行"), CCB("00080005","中国建设银行"), 
	
	BOCO("00080006","交通银行"), SDB("00080007","深圳发展银行"), CMBC("00080009","中国民生银行"), 
	
	HXB("00080010","华夏银行"), CIB("00080011","兴业银行"), CITIC("00080012","中信银行"), 
	
	CEB("00080013","中国光大银行"), PAB("00080014","平安银行"), PSBC("00080016","中国邮政储蓄银行"), 
	
	ADBC("00080028","中国农业发展银行"), CGB("00080029","广东发展银行"), RCB("00080052","农村合作银行"), 
	
	RCC("00080057","农村信用社(含北京农村商业银行)"), CRCB("00080073","重庆农村商业银行"), NBCB("00080076","宁波银行"), 
	
	DLCB("00080079","大连银行"), NCCB("00080085","南昌银行"), SPDB("00080168","上海浦东发展银行"), 
	
	HZCB("00080035","杭州银行"), SHB("00080015","上海银行"), BCCB("00080020","北京银行"), 
	
	NJCB("00080080","南京银行"), ZZCB("00080188","郑州银行"), QZCB("00080088","泉州银行"),
	
	DGCB("00080081","东莞银行");
	
    
    public final String code;
    
    public final String desc;

    //构造器默认也只能是private, 从而保证构造函数只能在内部使用
    private BankEnum(String code,String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getDesc() {
        return desc;
    }
    
    /**
     * 通过枚举<code>code</code>获得枚举
     * 
     * @param code
     * @return
     */
    public static BankEnum getByCode(String code) {
        for (BankEnum bank : values()) {
            if (bank.getCode().equals(code)) {
                return bank;
            }
        }
        return null;
    }
    
    public static BankEnum nameOf(String name){
    	BankEnum bank = null;
		if (name != null){
			for (BankEnum type : BankEnum.values()) {
				if (type.name().equalsIgnoreCase(name))
					bank = type;
			}
		}
		return bank;
	}
}
