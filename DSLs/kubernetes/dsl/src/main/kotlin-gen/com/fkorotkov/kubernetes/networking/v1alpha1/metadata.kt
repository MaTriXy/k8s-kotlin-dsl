// GENERATED
package com.fkorotkov.kubernetes.networking.v1alpha1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddress as v1alpha1_IPAddress
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddressList as v1alpha1_IPAddressList
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDR as v1alpha1_ServiceCIDR
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDRList as v1alpha1_ServiceCIDRList


fun  v1alpha1_IPAddress.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1alpha1_IPAddressList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1alpha1_ServiceCIDR.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1alpha1_ServiceCIDRList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

