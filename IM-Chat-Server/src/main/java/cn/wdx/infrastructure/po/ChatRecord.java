package cn.wdx.infrastructure.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName chat_record
 */
@TableName(value ="chat_record")
@Data
public class ChatRecord implements Serializable {
    /**
     * 自增ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 自己ID
     */
    private String userid;

    /**
     * 好友ID
     */
    private String friendid;

    /**
     * 消息内容
     */
    private String msgcontent;

    /**
     * 消息时间
     */
    private Date msgdate;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 
     */
    private Integer talktype;

    /**
     * 
     */
    private Integer msgtype;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ChatRecord other = (ChatRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getFriendid() == null ? other.getFriendid() == null : this.getFriendid().equals(other.getFriendid()))
            && (this.getMsgcontent() == null ? other.getMsgcontent() == null : this.getMsgcontent().equals(other.getMsgcontent()))
            && (this.getMsgdate() == null ? other.getMsgdate() == null : this.getMsgdate().equals(other.getMsgdate()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getTalktype() == null ? other.getTalktype() == null : this.getTalktype().equals(other.getTalktype()))
            && (this.getMsgtype() == null ? other.getMsgtype() == null : this.getMsgtype().equals(other.getMsgtype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getFriendid() == null) ? 0 : getFriendid().hashCode());
        result = prime * result + ((getMsgcontent() == null) ? 0 : getMsgcontent().hashCode());
        result = prime * result + ((getMsgdate() == null) ? 0 : getMsgdate().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getTalktype() == null) ? 0 : getTalktype().hashCode());
        result = prime * result + ((getMsgtype() == null) ? 0 : getMsgtype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", friendid=").append(friendid);
        sb.append(", msgcontent=").append(msgcontent);
        sb.append(", msgdate=").append(msgdate);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", talktype=").append(talktype);
        sb.append(", msgtype=").append(msgtype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}