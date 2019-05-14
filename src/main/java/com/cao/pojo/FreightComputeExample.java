package com.cao.pojo;

import java.util.ArrayList;
import java.util.List;

public class FreightComputeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FreightComputeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFreightIdIsNull() {
            addCriterion("Freight_Id is null");
            return (Criteria) this;
        }

        public Criteria andFreightIdIsNotNull() {
            addCriterion("Freight_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFreightIdEqualTo(Integer value) {
            addCriterion("Freight_Id =", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdNotEqualTo(Integer value) {
            addCriterion("Freight_Id <>", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdGreaterThan(Integer value) {
            addCriterion("Freight_Id >", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Freight_Id >=", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdLessThan(Integer value) {
            addCriterion("Freight_Id <", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdLessThanOrEqualTo(Integer value) {
            addCriterion("Freight_Id <=", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdIn(List<Integer> values) {
            addCriterion("Freight_Id in", values, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdNotIn(List<Integer> values) {
            addCriterion("Freight_Id not in", values, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdBetween(Integer value1, Integer value2) {
            addCriterion("Freight_Id between", value1, value2, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Freight_Id not between", value1, value2, "freightId");
            return (Criteria) this;
        }

        public Criteria andInnerFristIsNull() {
            addCriterion("Inner_Frist is null");
            return (Criteria) this;
        }

        public Criteria andInnerFristIsNotNull() {
            addCriterion("Inner_Frist is not null");
            return (Criteria) this;
        }

        public Criteria andInnerFristEqualTo(Integer value) {
            addCriterion("Inner_Frist =", value, "innerFrist");
            return (Criteria) this;
        }

        public Criteria andInnerFristNotEqualTo(Integer value) {
            addCriterion("Inner_Frist <>", value, "innerFrist");
            return (Criteria) this;
        }

        public Criteria andInnerFristGreaterThan(Integer value) {
            addCriterion("Inner_Frist >", value, "innerFrist");
            return (Criteria) this;
        }

        public Criteria andInnerFristGreaterThanOrEqualTo(Integer value) {
            addCriterion("Inner_Frist >=", value, "innerFrist");
            return (Criteria) this;
        }

        public Criteria andInnerFristLessThan(Integer value) {
            addCriterion("Inner_Frist <", value, "innerFrist");
            return (Criteria) this;
        }

        public Criteria andInnerFristLessThanOrEqualTo(Integer value) {
            addCriterion("Inner_Frist <=", value, "innerFrist");
            return (Criteria) this;
        }

        public Criteria andInnerFristIn(List<Integer> values) {
            addCriterion("Inner_Frist in", values, "innerFrist");
            return (Criteria) this;
        }

        public Criteria andInnerFristNotIn(List<Integer> values) {
            addCriterion("Inner_Frist not in", values, "innerFrist");
            return (Criteria) this;
        }

        public Criteria andInnerFristBetween(Integer value1, Integer value2) {
            addCriterion("Inner_Frist between", value1, value2, "innerFrist");
            return (Criteria) this;
        }

        public Criteria andInnerFristNotBetween(Integer value1, Integer value2) {
            addCriterion("Inner_Frist not between", value1, value2, "innerFrist");
            return (Criteria) this;
        }

        public Criteria andInnerSecondIsNull() {
            addCriterion("Inner_Second is null");
            return (Criteria) this;
        }

        public Criteria andInnerSecondIsNotNull() {
            addCriterion("Inner_Second is not null");
            return (Criteria) this;
        }

        public Criteria andInnerSecondEqualTo(Integer value) {
            addCriterion("Inner_Second =", value, "innerSecond");
            return (Criteria) this;
        }

        public Criteria andInnerSecondNotEqualTo(Integer value) {
            addCriterion("Inner_Second <>", value, "innerSecond");
            return (Criteria) this;
        }

        public Criteria andInnerSecondGreaterThan(Integer value) {
            addCriterion("Inner_Second >", value, "innerSecond");
            return (Criteria) this;
        }

        public Criteria andInnerSecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("Inner_Second >=", value, "innerSecond");
            return (Criteria) this;
        }

        public Criteria andInnerSecondLessThan(Integer value) {
            addCriterion("Inner_Second <", value, "innerSecond");
            return (Criteria) this;
        }

        public Criteria andInnerSecondLessThanOrEqualTo(Integer value) {
            addCriterion("Inner_Second <=", value, "innerSecond");
            return (Criteria) this;
        }

        public Criteria andInnerSecondIn(List<Integer> values) {
            addCriterion("Inner_Second in", values, "innerSecond");
            return (Criteria) this;
        }

        public Criteria andInnerSecondNotIn(List<Integer> values) {
            addCriterion("Inner_Second not in", values, "innerSecond");
            return (Criteria) this;
        }

        public Criteria andInnerSecondBetween(Integer value1, Integer value2) {
            addCriterion("Inner_Second between", value1, value2, "innerSecond");
            return (Criteria) this;
        }

        public Criteria andInnerSecondNotBetween(Integer value1, Integer value2) {
            addCriterion("Inner_Second not between", value1, value2, "innerSecond");
            return (Criteria) this;
        }

        public Criteria andOutterFirstIsNull() {
            addCriterion("Outter_First is null");
            return (Criteria) this;
        }

        public Criteria andOutterFirstIsNotNull() {
            addCriterion("Outter_First is not null");
            return (Criteria) this;
        }

        public Criteria andOutterFirstEqualTo(Integer value) {
            addCriterion("Outter_First =", value, "outterFirst");
            return (Criteria) this;
        }

        public Criteria andOutterFirstNotEqualTo(Integer value) {
            addCriterion("Outter_First <>", value, "outterFirst");
            return (Criteria) this;
        }

        public Criteria andOutterFirstGreaterThan(Integer value) {
            addCriterion("Outter_First >", value, "outterFirst");
            return (Criteria) this;
        }

        public Criteria andOutterFirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("Outter_First >=", value, "outterFirst");
            return (Criteria) this;
        }

        public Criteria andOutterFirstLessThan(Integer value) {
            addCriterion("Outter_First <", value, "outterFirst");
            return (Criteria) this;
        }

        public Criteria andOutterFirstLessThanOrEqualTo(Integer value) {
            addCriterion("Outter_First <=", value, "outterFirst");
            return (Criteria) this;
        }

        public Criteria andOutterFirstIn(List<Integer> values) {
            addCriterion("Outter_First in", values, "outterFirst");
            return (Criteria) this;
        }

        public Criteria andOutterFirstNotIn(List<Integer> values) {
            addCriterion("Outter_First not in", values, "outterFirst");
            return (Criteria) this;
        }

        public Criteria andOutterFirstBetween(Integer value1, Integer value2) {
            addCriterion("Outter_First between", value1, value2, "outterFirst");
            return (Criteria) this;
        }

        public Criteria andOutterFirstNotBetween(Integer value1, Integer value2) {
            addCriterion("Outter_First not between", value1, value2, "outterFirst");
            return (Criteria) this;
        }

        public Criteria andOutterSecondIsNull() {
            addCriterion("Outter_Second is null");
            return (Criteria) this;
        }

        public Criteria andOutterSecondIsNotNull() {
            addCriterion("Outter_Second is not null");
            return (Criteria) this;
        }

        public Criteria andOutterSecondEqualTo(Integer value) {
            addCriterion("Outter_Second =", value, "outterSecond");
            return (Criteria) this;
        }

        public Criteria andOutterSecondNotEqualTo(Integer value) {
            addCriterion("Outter_Second <>", value, "outterSecond");
            return (Criteria) this;
        }

        public Criteria andOutterSecondGreaterThan(Integer value) {
            addCriterion("Outter_Second >", value, "outterSecond");
            return (Criteria) this;
        }

        public Criteria andOutterSecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("Outter_Second >=", value, "outterSecond");
            return (Criteria) this;
        }

        public Criteria andOutterSecondLessThan(Integer value) {
            addCriterion("Outter_Second <", value, "outterSecond");
            return (Criteria) this;
        }

        public Criteria andOutterSecondLessThanOrEqualTo(Integer value) {
            addCriterion("Outter_Second <=", value, "outterSecond");
            return (Criteria) this;
        }

        public Criteria andOutterSecondIn(List<Integer> values) {
            addCriterion("Outter_Second in", values, "outterSecond");
            return (Criteria) this;
        }

        public Criteria andOutterSecondNotIn(List<Integer> values) {
            addCriterion("Outter_Second not in", values, "outterSecond");
            return (Criteria) this;
        }

        public Criteria andOutterSecondBetween(Integer value1, Integer value2) {
            addCriterion("Outter_Second between", value1, value2, "outterSecond");
            return (Criteria) this;
        }

        public Criteria andOutterSecondNotBetween(Integer value1, Integer value2) {
            addCriterion("Outter_Second not between", value1, value2, "outterSecond");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    @Override
    public String toString() {
        return "FreightComputeExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }
}