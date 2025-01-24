// GENERATED
package com.fkorotkov.kubernetes.storage.v1alpha1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.storage.v1alpha1.VolumeAttributesClass as v1alpha1_VolumeAttributesClass
import io.fabric8.kubernetes.api.model.storage.v1alpha1.VolumeAttributesClassList as v1alpha1_VolumeAttributesClassList


fun  v1alpha1_VolumeAttributesClass.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1alpha1_VolumeAttributesClassList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

