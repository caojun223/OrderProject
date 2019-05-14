package com.cao.mapper;

import com.cao.pojo.ReceiptInfo;
import com.cao.pojo.ReceiptInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiptInfoMapper {
    int countByExample(ReceiptInfoExample example);

    int deleteByExample(ReceiptInfoExample example);

    int deleteByPrimaryKey(Integer receiptId);

    int insert(ReceiptInfo record);

    int insertSelective(ReceiptInfo record);

    List<ReceiptInfo> selectByExample(ReceiptInfoExample example);

    ReceiptInfo selectByPrimaryKey(Integer receiptId);

    int updateByExampleSelective(@Param("record") ReceiptInfo record, @Param("example") ReceiptInfoExample example);

    int updateByExample(@Param("record") ReceiptInfo record, @Param("example") ReceiptInfoExample example);

    int updateByPrimaryKeySelective(ReceiptInfo record);

    int updateByPrimaryKey(ReceiptInfo record);

    //根据ID查询收货信息
    ReceiptInfo selectReceiptInfoByPrimaryKey(Integer shipId);
}