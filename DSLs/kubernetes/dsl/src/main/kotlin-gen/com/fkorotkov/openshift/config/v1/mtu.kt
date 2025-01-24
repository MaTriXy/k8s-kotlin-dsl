// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.MTUMigration as v1_MTUMigration
import io.fabric8.openshift.api.model.config.v1.NetworkMigration as v1_NetworkMigration


fun  v1_NetworkMigration.`mtu`(block: v1_MTUMigration.() -> Unit = {}) {
  if(this.`mtu` == null) {
    this.`mtu` = v1_MTUMigration()
  }

  this.`mtu`.block()
}

