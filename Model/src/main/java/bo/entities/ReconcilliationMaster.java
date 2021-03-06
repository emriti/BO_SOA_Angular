package bo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the RECONCILLIATION_MASTER database table.
 * 
 */
@Entity
@Table(name = "RECONCILLIATION_MASTER")
@NamedQuery(name = "ReconcilliationMaster.findAll", query = "SELECT r FROM ReconcilliationMaster r")
public class ReconcilliationMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "RECONCILE_NO")
	private String reconcileNo;

	@Column(name = "BALANCE_SNAPSHOT")
	private BigDecimal balanceSnapshot;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	private Timestamp createdDate;

	@Column(name = "IS_EXECUTED_BY_PENIHILAN")
	private String isExecutedByPenihilan;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DATE")
	private Timestamp modifiedDate;

	@Column(name = "NEXT_PAYMENT_AMOUNT")
	private BigDecimal nextPaymentAmount;

	@Column(name = "PAYMENT_TYPE_ID")
	private BigDecimal paymentTypeId;

	@Column(name = "PENIHILAN_AMOUNT")
	private BigDecimal penihilanAmount;

	@Column(name = "PENIHILAN_BY")
	private String penihilanBy;

	@Column(name = "PENIHILAN_DATE")
	private Timestamp penihilanDate;

	@Column(name = "PENIHILAN_ID")
	private BigDecimal penihilanId;

	@Column(name = "RECONCILE_DATE")
	private Timestamp reconcileDate;

	@Column(name = "RECONCILE_ID")
	@SequenceGenerator(name = "RECONCILLIATION_MASTER_RECONCILENO_GENERATOR", sequenceName = "RECONCILLIATION_MASTER_SEQ_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RECONCILLIATION_MASTER_RECONCILENO_GENERATOR")
	private BigDecimal reconcileId;

	public ReconcilliationMaster() {
	}

	public String getReconcileNo() {
		return this.reconcileNo;
	}

	public void setReconcileNo(String reconcileNo) {
		this.reconcileNo = reconcileNo;
	}

	public BigDecimal getBalanceSnapshot() {
		return this.balanceSnapshot;
	}

	public void setBalanceSnapshot(BigDecimal balanceSnapshot) {
		this.balanceSnapshot = balanceSnapshot;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getIsExecutedByPenihilan() {
		return this.isExecutedByPenihilan;
	}

	public void setIsExecutedByPenihilan(String isExecutedByPenihilan) {
		this.isExecutedByPenihilan = isExecutedByPenihilan;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public BigDecimal getNextPaymentAmount() {
		return this.nextPaymentAmount;
	}

	public void setNextPaymentAmount(BigDecimal nextPaymentAmount) {
		this.nextPaymentAmount = nextPaymentAmount;
	}

	public BigDecimal getPaymentTypeId() {
		return this.paymentTypeId;
	}

	public void setPaymentTypeId(BigDecimal paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	public BigDecimal getPenihilanAmount() {
		return this.penihilanAmount;
	}

	public void setPenihilanAmount(BigDecimal penihilanAmount) {
		this.penihilanAmount = penihilanAmount;
	}

	public String getPenihilanBy() {
		return this.penihilanBy;
	}

	public void setPenihilanBy(String penihilanBy) {
		this.penihilanBy = penihilanBy;
	}

	public Timestamp getPenihilanDate() {
		return this.penihilanDate;
	}

	public void setPenihilanDate(Timestamp penihilanDate) {
		this.penihilanDate = penihilanDate;
	}

	public BigDecimal getPenihilanId() {
		return this.penihilanId;
	}

	public void setPenihilanId(BigDecimal penihilanId) {
		this.penihilanId = penihilanId;
	}

	public Timestamp getReconcileDate() {
		return this.reconcileDate;
	}

	public void setReconcileDate(Timestamp reconcileDate) {
		this.reconcileDate = reconcileDate;
	}

	public BigDecimal getReconcileId() {
		return this.reconcileId;
	}

	public void setReconcileId(BigDecimal reconcileId) {
		this.reconcileId = reconcileId;
	}

}