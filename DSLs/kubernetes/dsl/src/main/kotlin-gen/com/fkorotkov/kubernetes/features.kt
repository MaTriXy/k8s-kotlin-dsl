// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeRuntimeHandler as model_NodeRuntimeHandler
import io.fabric8.kubernetes.api.model.NodeRuntimeHandlerFeatures as model_NodeRuntimeHandlerFeatures


fun  model_NodeRuntimeHandler.`features`(block: model_NodeRuntimeHandlerFeatures.() -> Unit = {}) {
  if(this.`features` == null) {
    this.`features` = model_NodeRuntimeHandlerFeatures()
  }

  this.`features`.block()
}

