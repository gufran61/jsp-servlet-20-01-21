package com.bean;

public class PaymentBean {
private String date;
private String amount;
private String rName;
private String rPnumber;
private String gName;
private String GPnumber;
private String note;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getrName() {
	return rName;
}
public void setrName(String rName) {
	this.rName = rName;
}
public String getrPnumber() {
	return rPnumber;
}
public void setrPnumber(String rPnumber) {
	this.rPnumber = rPnumber;
}
public String getgName() {
	return gName;
}
public void setgName(String gName) {
	this.gName = gName;
}
public String getGPnumber() {
	return GPnumber;
}
public void setGPnumber(String gPnumber) {
	GPnumber = gPnumber;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
@Override
public String toString() {
	return "PaymentBean [date=" + date + ", amount=" + amount + ", rName=" + rName + ", rPnumber=" + rPnumber
			+ ", gName=" + gName + ", GPnumber=" + GPnumber + ", note=" + note + "]";
}

}
