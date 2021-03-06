package com.maubis.scarlet.base.support.database

import com.maubis.scarlet.base.config.CoreConfig
import com.maubis.scarlet.base.core.database.TagsProvider
import com.maubis.scarlet.base.core.database.room.tag.TagDao

val tagsDB: TagsProvider get() = CoreConfig.instance.tagsDatabase()

class TagsDB : TagsProvider() {

  override fun database(): TagDao = CoreConfig.instance.database().tags()

}