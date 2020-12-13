package com.joshua.bloch.book.ed3.chapter2.item2.builder;


import java.util.TimeZone;

public class ReportQuery {
	private final String fromDate;
	private final String toDate;
	private final String user;
	private final String product;
	private final String eventType;
	private final String businessObjectType;
	private final TimeZone timeZone;
	private final String managedApp;
	private final String description;
	private final boolean includeChildObjects;
	private final boolean includeImpersonator;
	private final boolean includeExtendedObjectIdentiferColumns;
	private final boolean includeAttributes;
	private final boolean attributeDetailMode;

	public ReportQuery(Builder b)
	{
		this.fromDate = b.fromDate;
		this.toDate = b.toDate;
		this.user = b.user;
		this.product = b.product;
		this.eventType = b.eventType;
		this.businessObjectType = b.businessObjectType;
		this.timeZone = b.timeZone;
		this.managedApp = b.managedApp;
		this.description = b.description;
		this.includeChildObjects = b.includeChildObjects;
		this.includeImpersonator = b.includeImpersonator;
		this.includeExtendedObjectIdentiferColumns = b.includeExtendedObjectIdentiferColumns;
		this.includeAttributes = b.includeAttributes;
		this.attributeDetailMode = b.attributeDetailMode;
	}

	public String getFromDate()
	{
		return fromDate;
	}

	public String getToDate()
	{
		return toDate;
	}

	public String getUser()
	{
		return user;
	}

	public String getProduct()
	{
		return product;
	}

	public String getEventType()
	{
		return eventType;
	}

	public String getBusinessObjectType()
	{
		return businessObjectType;
	}

	public TimeZone getTimeZone()
	{
		return timeZone;
	}

	public String getManagedApp()
	{
		return managedApp;
	}

	public String getDescription()
	{
		return description;
	}

	public boolean isIncludeChildObjects()
	{
		return includeChildObjects;
	}

	public boolean isIncludeImpersonator()
	{
		return includeImpersonator;
	}

	public boolean isIncludeExtendedObjectIdentiferColumns()
	{
		return includeExtendedObjectIdentiferColumns;
	}

	public boolean isIncludeAttributes()
	{
		return includeAttributes;
	}

	public boolean isAttributeDetailMode()
	{
		return attributeDetailMode;
	}

	static public class Builder
	{

		private String fromDate;
		private String toDate;
		private String user;
		private String product;
		private String eventType;
		private String businessObjectType;
		private TimeZone timeZone;
		private String managedApp;
		private String description;
		private boolean includeChildObjects;
		private boolean includeImpersonator;
		private boolean includeExtendedObjectIdentiferColumns;
		private boolean includeAttributes;
		private boolean attributeDetailMode;


		public Builder setFromDate(String fromDate)
		{
			this.fromDate = fromDate;
			return this;
		}

		public Builder setToDate(String toDate)
		{
			this.toDate = toDate;
			return this;
		}

		public Builder setUser(String user)
		{
			this.user = user;
			return this;
		}

		public Builder setProduct(String product)
		{
			this.product = product;
			return this;
		}

		public Builder setEventType(String eventType)
		{
			this.eventType = eventType;
			return this;
		}

		public Builder setBusinessObjectType(String businessObjectType)
		{
			this.businessObjectType = businessObjectType;
			return this;
		}

		public Builder setTimeZone(TimeZone timeZone)
		{
			this.timeZone = timeZone;
			return this;
		}

		public Builder setManagedApp(String managedApp)
		{
			this.managedApp = managedApp;
			return this;
		}

		public Builder setDescription(String description)
		{
			this.description = description;
			return this;
		}

		public Builder setIncludeChildObjects(boolean includeChildObjects)
		{
			this.includeChildObjects = includeChildObjects;
			return this;
		}

		public Builder setIncludeImpersonator(boolean includeImpersonator)
		{
			this.includeImpersonator = includeImpersonator;
			return this;
		}
		public Builder setIncludeExtendedObjectIdentiferColumns(boolean includeExtendedObjectIdentiferColumns)
		{
			this.includeExtendedObjectIdentiferColumns = includeExtendedObjectIdentiferColumns;
			return this;
		}

		public Builder setIncludeAttributes(boolean includeAttributes)
		{
			this.includeAttributes = includeAttributes;
			return this;
		}

		public Builder setAttributeDetailMode(boolean attributeDetailMode)
		{
			this.attributeDetailMode = attributeDetailMode;
			return this;
		}

	}
}
