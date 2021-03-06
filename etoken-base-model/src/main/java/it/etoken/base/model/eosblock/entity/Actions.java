package it.etoken.base.model.eosblock.entity;

import java.io.Serializable;
import java.util.Date;

public class Actions implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6390163412217768563L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.account
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.transaction_id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String transactionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.seq
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Short seq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.parent
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Integer parent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.name
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.created_at
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.data
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String data;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.id
     *
     * @return the value of actions.id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.id
     *
     * @param id the value for actions.id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.account
     *
     * @return the value of actions.account
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.account
     *
     * @param account the value for actions.account
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.transaction_id
     *
     * @return the value of actions.transaction_id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.transaction_id
     *
     * @param transactionId the value for actions.transaction_id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.seq
     *
     * @return the value of actions.seq
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Short getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.seq
     *
     * @param seq the value for actions.seq
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setSeq(Short seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.parent
     *
     * @return the value of actions.parent
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.parent
     *
     * @param parent the value for actions.parent
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.name
     *
     * @return the value of actions.name
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.name
     *
     * @param name the value for actions.name
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.created_at
     *
     * @return the value of actions.created_at
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.created_at
     *
     * @param createdAt the value for actions.created_at
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.data
     *
     * @return the value of actions.data
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.data
     *
     * @param data the value for actions.data
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setData(String data) {
        this.data = data;
    }
}