package com.cao.pojo;

import java.io.Serializable;

public class FreightCompute implements Serializable {
    private Integer freightId;

    private Integer innerFrist;

    private Integer innerSecond;

    private Integer outterFirst;

    private Integer outterSecond;

    private static final long serialVersionUID = 1L;

    public Integer getFreightId() {
        return freightId;
    }

    public void setFreightId(Integer freightId) {
        this.freightId = freightId;
    }

    public Integer getInnerFrist() {
        return innerFrist;
    }

    public void setInnerFrist(Integer innerFrist) {
        this.innerFrist = innerFrist;
    }

    public Integer getInnerSecond() {
        return innerSecond;
    }

    public void setInnerSecond(Integer innerSecond) {
        this.innerSecond = innerSecond;
    }

    public Integer getOutterFirst() {
        return outterFirst;
    }

    public void setOutterFirst(Integer outterFirst) {
        this.outterFirst = outterFirst;
    }

    public Integer getOutterSecond() {
        return outterSecond;
    }

    public void setOutterSecond(Integer outterSecond) {
        this.outterSecond = outterSecond;
    }

    @Override
    public String toString() {
        return "FreightCompute{" +
                "freightId=" + freightId +
                ", innerFrist=" + innerFrist +
                ", innerSecond=" + innerSecond +
                ", outterFirst=" + outterFirst +
                ", outterSecond=" + outterSecond +
                '}';
    }
}