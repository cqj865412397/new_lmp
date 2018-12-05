package com.lmq.domain;

import java.util.Date;
import java.util.List;

public class Goods {
	//=========扩展============
	//库存（默认单品）
	Integer totalCount;
	//价格名称（默认单品）
	String ptype;
	//价格（默认单品）
	private String pName;//价格的中文名称（默认单品中文名称）
	double price;
	//单位
	String bitName;
	//商品图片地址
	String url;
	//商品id
	Integer Gid;
	//价格类型（模板）
	List<Pricetype> priceTypeList;
	
	
	//=====无规格商品=======
	//一口价格
	Double fristPrice;
	//一口价库存
	Integer count;
	//进货价
	double basePrice;
	//无规格商品的价格list
	List<Goodsinstanceprice> priceList;
	//=====无规格商品end=======
	
	//该商品下的单品集合
	List<Goodsinstance> gInList;
	//类别
	String tName;
	//图片地址
	String ImgUrl;
	
	
	//=========扩展end============
    private Integer id;

    private String name;

    private Integer tid;

    private Integer bid;

    private Date time;

    private String code;

    private String codeprev;

    private Integer sid;

    private Integer status;

    private Integer async;

    private String uid;

    private String user1;

    private String user2;

    private String user3;

    private String user4;

    private String user5;

    private String detail;

    
    
    public List<Pricetype> getPriceTypeList() {
		return priceTypeList;
	}

	public void setPriceTypeList(List<Pricetype> priceTypeList) {
		this.priceTypeList = priceTypeList;
	}

	public List<Goodsinstanceprice> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<Goodsinstanceprice> priceList) {
		this.priceList = priceList;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public Double getFristPrice() {
		return fristPrice;
	}

	public void setFristPrice(Double fristPrice) {
		this.fristPrice = fristPrice;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Goodsinstance> getgInList() {
		return gInList;
	}

	public void setgInList(List<Goodsinstance> gInList) {
		this.gInList = gInList;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getImgUrl() {
		return ImgUrl;
	}

	public void setImgUrl(String imgUrl) {
		ImgUrl = imgUrl;
	}

	public Integer getGid() {
		return Gid;
	}

	public void setGid(Integer gid) {
		Gid = gid;
	}

	public String getBitName() {
		return bitName;
	}

	public void setBitName(String bitName) {
		this.bitName = bitName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeprev() {
        return codeprev;
    }

    public void setCodeprev(String codeprev) {
        this.codeprev = codeprev;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAsync() {
        return async;
    }

    public void setAsync(Integer async) {
        this.async = async;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public String getUser3() {
        return user3;
    }

    public void setUser3(String user3) {
        this.user3 = user3;
    }

    public String getUser4() {
        return user4;
    }

    public void setUser4(String user4) {
        this.user4 = user4;
    }

    public String getUser5() {
        return user5;
    }

    public void setUser5(String user5) {
        this.user5 = user5;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}