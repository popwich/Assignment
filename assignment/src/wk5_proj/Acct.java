package wk5_proj;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.Builder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Acct {
	private int accountId;
	private double balance;	
	// Create a hash map
    Hashtable<String, Double> balanceHash = new Hashtable<String, Double>();
    Enumeration<String> userId;
    
	//private Set<Customer> balance;

	//setter and getter
	public void setAccountId(int value) {
		this.accountId = value;
	}
	
	public int getAccountId() {
		return this.accountId;
	}
	
	public void setBalance(double value) {
		this.balance = value;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Acct) {
			final Acct other = (Acct) obj;
			if (ObjectUtils.equals(accountId, other.accountId) == false)
				return false;
			return true;
		}
		return false;
	}


/*	@Override
	public int hashCode() {
		final HashCodeBuilder builder = new HashCodeBuilder();
		if (accountId != null)
			builder.append(accountId);
		return builder.toHashCode();
	}*/

	@Override
	public String toString() {
		final ToStringBuilder builder = new ToStringBuilder(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(accountId);
		return builder.toString();
	}

}
