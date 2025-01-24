// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.MTUMigration as v1_MTUMigration
import io.fabric8.openshift.api.model.config.v1.MTUMigrationValues as v1_MTUMigrationValues


fun  v1_MTUMigration.`machine`(block: v1_MTUMigrationValues.() -> Unit = {}) {
  if(this.`machine` == null) {
    this.`machine` = v1_MTUMigrationValues()
  }

  this.`machine`.block()
}

