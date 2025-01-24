// GENERATED
package com.fkorotkov.kubernetes.certificates.v1alpha1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.certificates.v1alpha1.ClusterTrustBundle as v1alpha1_ClusterTrustBundle
import io.fabric8.kubernetes.api.model.certificates.v1alpha1.ClusterTrustBundleList as v1alpha1_ClusterTrustBundleList


fun  v1alpha1_ClusterTrustBundle.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1alpha1_ClusterTrustBundleList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

