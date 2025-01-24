// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BareMetalPlatformLoadBalancer as v1_BareMetalPlatformLoadBalancer
import io.fabric8.openshift.api.model.config.v1.BareMetalPlatformStatus as v1_BareMetalPlatformStatus
import io.fabric8.openshift.api.model.config.v1.IngressSpec as v1_IngressSpec
import io.fabric8.openshift.api.model.config.v1.LoadBalancer as v1_LoadBalancer
import io.fabric8.openshift.api.model.config.v1.NutanixPlatformLoadBalancer as v1_NutanixPlatformLoadBalancer
import io.fabric8.openshift.api.model.config.v1.NutanixPlatformStatus as v1_NutanixPlatformStatus
import io.fabric8.openshift.api.model.config.v1.OpenStackPlatformLoadBalancer as v1_OpenStackPlatformLoadBalancer
import io.fabric8.openshift.api.model.config.v1.OpenStackPlatformStatus as v1_OpenStackPlatformStatus
import io.fabric8.openshift.api.model.config.v1.OvirtPlatformLoadBalancer as v1_OvirtPlatformLoadBalancer
import io.fabric8.openshift.api.model.config.v1.OvirtPlatformStatus as v1_OvirtPlatformStatus
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformLoadBalancer as v1_VSpherePlatformLoadBalancer
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformStatus as v1_VSpherePlatformStatus


fun  v1_BareMetalPlatformStatus.`loadBalancer`(block: v1_BareMetalPlatformLoadBalancer.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = v1_BareMetalPlatformLoadBalancer()
  }

  this.`loadBalancer`.block()
}


fun  v1_IngressSpec.`loadBalancer`(block: v1_LoadBalancer.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = v1_LoadBalancer()
  }

  this.`loadBalancer`.block()
}


fun  v1_NutanixPlatformStatus.`loadBalancer`(block: v1_NutanixPlatformLoadBalancer.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = v1_NutanixPlatformLoadBalancer()
  }

  this.`loadBalancer`.block()
}


fun  v1_OpenStackPlatformStatus.`loadBalancer`(block: v1_OpenStackPlatformLoadBalancer.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = v1_OpenStackPlatformLoadBalancer()
  }

  this.`loadBalancer`.block()
}


fun  v1_OvirtPlatformStatus.`loadBalancer`(block: v1_OvirtPlatformLoadBalancer.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = v1_OvirtPlatformLoadBalancer()
  }

  this.`loadBalancer`.block()
}


fun  v1_VSpherePlatformStatus.`loadBalancer`(block: v1_VSpherePlatformLoadBalancer.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = v1_VSpherePlatformLoadBalancer()
  }

  this.`loadBalancer`.block()
}

