package org.thq.kafka.model;



/**
 * @author ethan
 *
 * Jul 1, 2019
 */

public class Order {
  
 
  private Long id;
  

  private Long accountId;
  

  private Long createdDate;
  

  private long finishedDate;
  

  private long canceledDate;
  

  private Long amount;
  

  private Long price;
  

  private long filledAmount;
  
  
  private long filledCashAmount;
  

  private long filledFees;
  

  private Type type;
  
 
  private State state;
  
 
  private String symbol;


  private String base;
  

  private String quote;
  
  public Long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getAccountId() {
    return accountId;
  }

  public void setAccountId(long accountId) {
    this.accountId = accountId;
  }

  public long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(long createdDate) {
    this.createdDate = createdDate;
  }

  public long getFinishedDate() {
    return finishedDate;
  }

  public void setFinishedDate(long finishedDate) {
    this.finishedDate = finishedDate;
  }

  public long getCanceledDate() {
    return canceledDate;
  }

  public void setCanceledDate(long canceledDate) {
    this.canceledDate = canceledDate;
  }

  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public long getFilledAmount() {
    return filledAmount;
  }

  public void setFilledAmount(long filledAmount) {
    this.filledAmount = filledAmount;
  }

  public long getFilledCashAmount() {
    return filledCashAmount;
  }

  public void setFilledCashAmount(long filledCashAmount) {
    this.filledCashAmount = filledCashAmount;
  }

  public long getFilledFees() {
    return filledFees;
  }

  public void setFilledFees(long filledFees) {
    this.filledFees = filledFees;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public String getSymbol() {
    return symbol;
  }

  public void initSymbol() {
    this.symbol = getBase() + getQuote();
  }
  
  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }
  
  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }  
  

  public static enum State {
    submitted, filled, canceled, partial_canceled, partial_filled  
  }
  
  public static enum Type {
    sell_limit, buy_limit
  }
}

