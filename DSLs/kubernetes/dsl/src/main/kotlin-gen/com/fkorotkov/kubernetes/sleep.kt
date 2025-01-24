// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LifecycleHandler as model_LifecycleHandler
import io.fabric8.kubernetes.api.model.SleepAction as model_SleepAction


fun  model_LifecycleHandler.`sleep`(block: model_SleepAction.() -> Unit = {}) {
  if(this.`sleep` == null) {
    this.`sleep` = model_SleepAction()
  }

  this.`sleep`.block()
}

