package com.ecwid.api.v3.dto.customergroup.request

data class CustomerGroupUpdateRequest(
		val customerGroupId: Int = 0,
		val updatedCustomerGroup: UpdatedCustomerGroup = UpdatedCustomerGroup()
)