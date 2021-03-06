package com.myspace.testSpring.bean;

import java.util.ArrayList;
import java.util.List;

public class template_pricing_ruleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    public template_pricing_ruleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
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

        public Criteria andTariffTemplateIdIsNull() {
            addCriterion("tariff_template_id is null");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdIsNotNull() {
            addCriterion("tariff_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdEqualTo(Long value) {
            addCriterion("tariff_template_id =", value, "tariffTemplateId");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdNotEqualTo(Long value) {
            addCriterion("tariff_template_id <>", value, "tariffTemplateId");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdGreaterThan(Long value) {
            addCriterion("tariff_template_id >", value, "tariffTemplateId");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tariff_template_id >=", value, "tariffTemplateId");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdLessThan(Long value) {
            addCriterion("tariff_template_id <", value, "tariffTemplateId");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("tariff_template_id <=", value, "tariffTemplateId");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdIn(List<Long> values) {
            addCriterion("tariff_template_id in", values, "tariffTemplateId");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdNotIn(List<Long> values) {
            addCriterion("tariff_template_id not in", values, "tariffTemplateId");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdBetween(Long value1, Long value2) {
            addCriterion("tariff_template_id between", value1, value2, "tariffTemplateId");
            return (Criteria) this;
        }

        public Criteria andTariffTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("tariff_template_id not between", value1, value2, "tariffTemplateId");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdIsNull() {
            addCriterion("exe_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdIsNotNull() {
            addCriterion("exe_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdEqualTo(Integer value) {
            addCriterion("exe_rule_id =", value, "exeRuleId");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdNotEqualTo(Integer value) {
            addCriterion("exe_rule_id <>", value, "exeRuleId");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdGreaterThan(Integer value) {
            addCriterion("exe_rule_id >", value, "exeRuleId");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exe_rule_id >=", value, "exeRuleId");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdLessThan(Integer value) {
            addCriterion("exe_rule_id <", value, "exeRuleId");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("exe_rule_id <=", value, "exeRuleId");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdIn(List<Integer> values) {
            addCriterion("exe_rule_id in", values, "exeRuleId");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdNotIn(List<Integer> values) {
            addCriterion("exe_rule_id not in", values, "exeRuleId");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("exe_rule_id between", value1, value2, "exeRuleId");
            return (Criteria) this;
        }

        public Criteria andExeRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exe_rule_id not between", value1, value2, "exeRuleId");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleIsNull() {
            addCriterion("template_pricing_rule is null");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleIsNotNull() {
            addCriterion("template_pricing_rule is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleEqualTo(String value) {
            addCriterion("template_pricing_rule =", value, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleNotEqualTo(String value) {
            addCriterion("template_pricing_rule <>", value, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleGreaterThan(String value) {
            addCriterion("template_pricing_rule >", value, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleGreaterThanOrEqualTo(String value) {
            addCriterion("template_pricing_rule >=", value, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleLessThan(String value) {
            addCriterion("template_pricing_rule <", value, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleLessThanOrEqualTo(String value) {
            addCriterion("template_pricing_rule <=", value, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleLike(String value) {
            addCriterion("template_pricing_rule like", value, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleNotLike(String value) {
            addCriterion("template_pricing_rule not like", value, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleIn(List<String> values) {
            addCriterion("template_pricing_rule in", values, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleNotIn(List<String> values) {
            addCriterion("template_pricing_rule not in", values, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleBetween(String value1, String value2) {
            addCriterion("template_pricing_rule between", value1, value2, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andTemplatePricingRuleNotBetween(String value1, String value2) {
            addCriterion("template_pricing_rule not between", value1, value2, "templatePricingRule");
            return (Criteria) this;
        }

        public Criteria andPricingIdIsNull() {
            addCriterion("pricing_id is null");
            return (Criteria) this;
        }

        public Criteria andPricingIdIsNotNull() {
            addCriterion("pricing_id is not null");
            return (Criteria) this;
        }

        public Criteria andPricingIdEqualTo(String value) {
            addCriterion("pricing_id =", value, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdNotEqualTo(String value) {
            addCriterion("pricing_id <>", value, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdGreaterThan(String value) {
            addCriterion("pricing_id >", value, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdGreaterThanOrEqualTo(String value) {
            addCriterion("pricing_id >=", value, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdLessThan(String value) {
            addCriterion("pricing_id <", value, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdLessThanOrEqualTo(String value) {
            addCriterion("pricing_id <=", value, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdLike(String value) {
            addCriterion("pricing_id like", value, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdNotLike(String value) {
            addCriterion("pricing_id not like", value, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdIn(List<String> values) {
            addCriterion("pricing_id in", values, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdNotIn(List<String> values) {
            addCriterion("pricing_id not in", values, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdBetween(String value1, String value2) {
            addCriterion("pricing_id between", value1, value2, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingIdNotBetween(String value1, String value2) {
            addCriterion("pricing_id not between", value1, value2, "pricingId");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdIsNull() {
            addCriterion("pricing_object_id is null");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdIsNotNull() {
            addCriterion("pricing_object_id is not null");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdEqualTo(Integer value) {
            addCriterion("pricing_object_id =", value, "pricingObjectId");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdNotEqualTo(Integer value) {
            addCriterion("pricing_object_id <>", value, "pricingObjectId");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdGreaterThan(Integer value) {
            addCriterion("pricing_object_id >", value, "pricingObjectId");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pricing_object_id >=", value, "pricingObjectId");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdLessThan(Integer value) {
            addCriterion("pricing_object_id <", value, "pricingObjectId");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("pricing_object_id <=", value, "pricingObjectId");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdIn(List<Integer> values) {
            addCriterion("pricing_object_id in", values, "pricingObjectId");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdNotIn(List<Integer> values) {
            addCriterion("pricing_object_id not in", values, "pricingObjectId");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdBetween(Integer value1, Integer value2) {
            addCriterion("pricing_object_id between", value1, value2, "pricingObjectId");
            return (Criteria) this;
        }

        public Criteria andPricingObjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pricing_object_id not between", value1, value2, "pricingObjectId");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdIsNull() {
            addCriterion("balance_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdIsNotNull() {
            addCriterion("balance_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdEqualTo(Integer value) {
            addCriterion("balance_type_id =", value, "balanceTypeId");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdNotEqualTo(Integer value) {
            addCriterion("balance_type_id <>", value, "balanceTypeId");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdGreaterThan(Integer value) {
            addCriterion("balance_type_id >", value, "balanceTypeId");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_type_id >=", value, "balanceTypeId");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdLessThan(Integer value) {
            addCriterion("balance_type_id <", value, "balanceTypeId");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("balance_type_id <=", value, "balanceTypeId");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdIn(List<Integer> values) {
            addCriterion("balance_type_id in", values, "balanceTypeId");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdNotIn(List<Integer> values) {
            addCriterion("balance_type_id not in", values, "balanceTypeId");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("balance_type_id between", value1, value2, "balanceTypeId");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_type_id not between", value1, value2, "balanceTypeId");
            return (Criteria) this;
        }

        public Criteria andPricingNameIsNull() {
            addCriterion("pricing_name is null");
            return (Criteria) this;
        }

        public Criteria andPricingNameIsNotNull() {
            addCriterion("pricing_name is not null");
            return (Criteria) this;
        }

        public Criteria andPricingNameEqualTo(String value) {
            addCriterion("pricing_name =", value, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameNotEqualTo(String value) {
            addCriterion("pricing_name <>", value, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameGreaterThan(String value) {
            addCriterion("pricing_name >", value, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameGreaterThanOrEqualTo(String value) {
            addCriterion("pricing_name >=", value, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameLessThan(String value) {
            addCriterion("pricing_name <", value, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameLessThanOrEqualTo(String value) {
            addCriterion("pricing_name <=", value, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameLike(String value) {
            addCriterion("pricing_name like", value, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameNotLike(String value) {
            addCriterion("pricing_name not like", value, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameIn(List<String> values) {
            addCriterion("pricing_name in", values, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameNotIn(List<String> values) {
            addCriterion("pricing_name not in", values, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameBetween(String value1, String value2) {
            addCriterion("pricing_name between", value1, value2, "pricingName");
            return (Criteria) this;
        }

        public Criteria andPricingNameNotBetween(String value1, String value2) {
            addCriterion("pricing_name not between", value1, value2, "pricingName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table template_pricing_rule
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table template_pricing_rule
     *
     * @mbg.generated
     */
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
}