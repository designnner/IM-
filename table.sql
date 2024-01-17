# 用户表

    create table user(
        id bigint not null auto_increment comment '自增ID',
        userId varchar(9) comment '用户ID',
        userNickName varchar(32) comment '用户昵称',
        userHead varchar(16) comment '用户头像',
        userPassword varchar(64) comment '用户密码',
        createTime datetime comment '创建时间',
        updateTime datetime comment '更新时间',
        primary key (id),
        constraint idx_userId unique (userId)
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;



# 群组表

    create table groups(
        id bigint not null auto_increment comment '自增ID',
        groupId varchar(9) comment '群组ID',
        groupName varchar(16) comment '群组名称',
        groupHead varchar(16) comment '群组头像',
        createTime datetime comment '创建时间',
        updateTime datetime comment '更新时间',
        primary key (id),
        constraint idx_groupId unique (groupId)
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;



# 用户好友表

CREATE TABLE user_friend ( id bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID', userId bigint COMMENT '用户ID', userFriendId bigint COMMENT '好友用户ID', createTime datetime COMMENT '创建时间', updateTime datetime COMMENT '更新时间', PRIMARY KEY (id), CONSTRAINT uuid_idx UNIQUE (userId, userFriendId) ) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# 用户群组表

CREATE TABLE user_group ( id bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID', userId varchar(9) COMMENT '用户ID', groupId varchar(9) COMMENT '群组ID', createTime datetime COMMENT '创建时间', updateTime datetime COMMENT '更新时间', PRIMARY KEY (id), CONSTRAINT idx_uuid UNIQUE (userId, groupId) ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 对话框表

CREATE TABLE talk_box ( id bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID', userId varchar(9) COMMENT '用户ID', talkId varchar(9) COMMENT '对话框ID(好友ID、群组ID)', talkType int(4) COMMENT '对话框类型；0好友、1群组', createTime datetime COMMENT '创建时间', updateTime datetime COMMENT '更新时间', PRIMARY KEY (id), CONSTRAINT idx_talkId_userId UNIQUE (userId, talkId) ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 聊天记录

CREATE TABLE chat_record ( id bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID', userId varchar(9) COMMENT '自己ID', friendId varchar(9) COMMENT '好友ID', msgContent varchar(512) COMMENT '消息内容', msgDate datetime COMMENT '消息时间', createTime datetime COMMENT '创建时间', updateTime datetime COMMENT '更新时间', talkType int(4), msgType int(4) DEFAULT '0', PRIMARY KEY (id) ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

