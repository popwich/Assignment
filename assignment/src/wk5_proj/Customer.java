package wk5_proj;

import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Customer extends Person {
	private Acct bankAccount;
	//private Person person;
	
	public void setBankAccount(Acct bankAccount){
		
	}

	public <set>Acct getBankAccount(){
		return bankAccount;
		
	}
	
/*	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		final Customer rhs = (Customer) obj;
		final EqualsBuilder builder = new EqualsBuilder();
		builder.appendSuper(super.equals(rhs));
		builder.append(customerId, rhs.customerId);
		return builder.isEquals();
	}


	@Override
	public int hashCode() {
		final HashCodeBuilder builder = new HashCodeBuilder();
		builder.appendSuper(super.hashCode());
		builder.append(customerId);
		return builder.toHashCode();
	}

	@Override
	public String toString() {
		final ToStringBuilder builder = new ToStringBuilder(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
		builder.appendSuper(super.toString());
		builder.append(customerId);
		return builder.toString();
	}
*/
	
}