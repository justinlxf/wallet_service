package it.etoken.component.eosblock.dao.provider;

import it.etoken.base.model.eosblock.entity.Transactions;
import it.etoken.base.model.eosblock.entity.TransactionsExample.Criteria;
import it.etoken.base.model.eosblock.entity.TransactionsExample.Criterion;
import it.etoken.base.model.eosblock.entity.TransactionsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TransactionsSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String countByExample(TransactionsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("transactions");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String deleteByExample(TransactionsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("transactions");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String insertSelective(Transactions record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("transactions");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getBlockId() != null) {
            sql.VALUES("block_id", "#{blockId,jdbcType=INTEGER}");
        }
        
        if (record.getRefBlockNum() != null) {
            sql.VALUES("ref_block_num", "#{refBlockNum,jdbcType=INTEGER}");
        }
        
        if (record.getRefBlockPrefix() != null) {
            sql.VALUES("ref_block_prefix", "#{refBlockPrefix,jdbcType=INTEGER}");
        }
        
        if (record.getExpiration() != null) {
            sql.VALUES("expiration", "#{expiration,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPending() != null) {
            sql.VALUES("pending", "#{pending,jdbcType=BIT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNumActions() != null) {
            sql.VALUES("num_actions", "#{numActions,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String selectByExample(TransactionsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("block_id");
        sql.SELECT("ref_block_num");
        sql.SELECT("ref_block_prefix");
        sql.SELECT("expiration");
        sql.SELECT("pending");
        sql.SELECT("created_at");
        sql.SELECT("num_actions");
        sql.SELECT("updated_at");
        sql.FROM("transactions");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Transactions record = (Transactions) parameter.get("record");
        TransactionsExample example = (TransactionsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("transactions");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getBlockId() != null) {
            sql.SET("block_id = #{record.blockId,jdbcType=INTEGER}");
        }
        
        if (record.getRefBlockNum() != null) {
            sql.SET("ref_block_num = #{record.refBlockNum,jdbcType=INTEGER}");
        }
        
        if (record.getRefBlockPrefix() != null) {
            sql.SET("ref_block_prefix = #{record.refBlockPrefix,jdbcType=INTEGER}");
        }
        
        if (record.getExpiration() != null) {
            sql.SET("expiration = #{record.expiration,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPending() != null) {
            sql.SET("pending = #{record.pending,jdbcType=BIT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNumActions() != null) {
            sql.SET("num_actions = #{record.numActions,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("transactions");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("block_id = #{record.blockId,jdbcType=INTEGER}");
        sql.SET("ref_block_num = #{record.refBlockNum,jdbcType=INTEGER}");
        sql.SET("ref_block_prefix = #{record.refBlockPrefix,jdbcType=INTEGER}");
        sql.SET("expiration = #{record.expiration,jdbcType=TIMESTAMP}");
        sql.SET("pending = #{record.pending,jdbcType=BIT}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("num_actions = #{record.numActions,jdbcType=INTEGER}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TransactionsExample example = (TransactionsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String updateByPrimaryKeySelective(Transactions record) {
        SQL sql = new SQL();
        sql.UPDATE("transactions");
        
        if (record.getBlockId() != null) {
            sql.SET("block_id = #{blockId,jdbcType=INTEGER}");
        }
        
        if (record.getRefBlockNum() != null) {
            sql.SET("ref_block_num = #{refBlockNum,jdbcType=INTEGER}");
        }
        
        if (record.getRefBlockPrefix() != null) {
            sql.SET("ref_block_prefix = #{refBlockPrefix,jdbcType=INTEGER}");
        }
        
        if (record.getExpiration() != null) {
            sql.SET("expiration = #{expiration,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPending() != null) {
            sql.SET("pending = #{pending,jdbcType=BIT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNumActions() != null) {
            sql.SET("num_actions = #{numActions,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    protected void applyWhere(SQL sql, TransactionsExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}