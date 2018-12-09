package com.lmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.GoodsInstanceVo;
import com.lmq.domain.Goodsinstance;

public interface GoodsinstanceMapper {
	//��ѯ��Ʒ�µ�Ʒ����ϸ��Ϣ
	public List<Goodsinstance> queryGoodsinstanceInfoByGid(Integer gId) ;
	//��ѯ��Ʒ��Ĭ�ϵ�Ʒ
	public Goodsinstance queryOneGoodsInstanceByGid(Integer gId);
	//ɾ����Ʒ������ƷGid
	public Integer deleteByGid(Integer gId);
	//��ѯ��Ʒ�����е�Ʒid����
	public List<Integer> quertyGoodsInstanceIdsByGid(Integer gId);
	//��ѯ��Ʒ��Ϣ���ϣ���ӡ��
	public List<Goodsinstance> queryGoodsInstanceInfoByGid(Integer gId);
	//��ѯ��Ʒ�۸� (����>�ͻ����ͼ۸�>Ĭ�ϼ۸�) ֧��ģ����ѯ gNameΪ����Ʒ������Ʒ���ƣ�
	public List<GoodsInstanceVo> queryGoodsInstanceVoList(@Param("cId") Integer cId,@Param("gName") String gName);
	//查询sid门店下全部单品默认价格
    public List<GoodsInstanceVo> queryGoodsInstanceVoAboutDefPrice(Integer sId);
	//查询sid门店下单个单品默认价格
    public GoodsInstanceVo querySimGoodsInstanceVoAboutDefPriceList(@Param("gInId") Integer gInId,@Param("sId") Integer sId);
	//查询sid门店下单个单品报价
    public GoodsInstanceVo querySimGoodsInstanceVoAboutPrice(@Param("gInId") Integer gInId,@Param("sId") Integer sId,@Param("cId") Integer cId);
    /**
	 * �Զ���
	 */
    int deleteByPrimaryKey(Integer id);
	//��������
    int insert(Goodsinstance record);

    int insertSelective(Goodsinstance record);

    Goodsinstance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsinstance record);

    int updateByPrimaryKey(Goodsinstance record);
}