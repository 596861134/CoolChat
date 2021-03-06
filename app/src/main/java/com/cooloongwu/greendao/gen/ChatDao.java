package com.cooloongwu.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.cooloongwu.coolchat.entity.Chat;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CHAT".
*/
public class ChatDao extends AbstractDao<Chat, Long> {

    public static final String TABLENAME = "CHAT";

    /**
     * Properties of entity Chat.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property FromId = new Property(1, int.class, "fromId", false, "FROM_ID");
        public final static Property ToId = new Property(2, int.class, "toId", false, "TO_ID");
        public final static Property ChatType = new Property(3, String.class, "chatType", false, "CHAT_TYPE");
        public final static Property FromName = new Property(4, String.class, "fromName", false, "FROM_NAME");
        public final static Property FromAvatar = new Property(5, String.class, "fromAvatar", false, "FROM_AVATAR");
        public final static Property Content = new Property(6, String.class, "content", false, "CONTENT");
        public final static Property ContentType = new Property(7, String.class, "contentType", false, "CONTENT_TYPE");
        public final static Property AudioLength = new Property(8, String.class, "audioLength", false, "AUDIO_LENGTH");
        public final static Property Time = new Property(9, String.class, "time", false, "TIME");
        public final static Property IsRead = new Property(10, boolean.class, "isRead", false, "IS_READ");
        public final static Property MsgId = new Property(11, int.class, "msgId", false, "MSG_ID");
    }


    public ChatDao(DaoConfig config) {
        super(config);
    }
    
    public ChatDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHAT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"FROM_ID\" INTEGER NOT NULL ," + // 1: fromId
                "\"TO_ID\" INTEGER NOT NULL ," + // 2: toId
                "\"CHAT_TYPE\" TEXT," + // 3: chatType
                "\"FROM_NAME\" TEXT," + // 4: fromName
                "\"FROM_AVATAR\" TEXT," + // 5: fromAvatar
                "\"CONTENT\" TEXT," + // 6: content
                "\"CONTENT_TYPE\" TEXT," + // 7: contentType
                "\"AUDIO_LENGTH\" TEXT," + // 8: audioLength
                "\"TIME\" TEXT," + // 9: time
                "\"IS_READ\" INTEGER NOT NULL ," + // 10: isRead
                "\"MSG_ID\" INTEGER NOT NULL );"); // 11: msgId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHAT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Chat entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getFromId());
        stmt.bindLong(3, entity.getToId());
 
        String chatType = entity.getChatType();
        if (chatType != null) {
            stmt.bindString(4, chatType);
        }
 
        String fromName = entity.getFromName();
        if (fromName != null) {
            stmt.bindString(5, fromName);
        }
 
        String fromAvatar = entity.getFromAvatar();
        if (fromAvatar != null) {
            stmt.bindString(6, fromAvatar);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(7, content);
        }
 
        String contentType = entity.getContentType();
        if (contentType != null) {
            stmt.bindString(8, contentType);
        }
 
        String audioLength = entity.getAudioLength();
        if (audioLength != null) {
            stmt.bindString(9, audioLength);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(10, time);
        }
        stmt.bindLong(11, entity.getIsRead() ? 1L: 0L);
        stmt.bindLong(12, entity.getMsgId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Chat entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getFromId());
        stmt.bindLong(3, entity.getToId());
 
        String chatType = entity.getChatType();
        if (chatType != null) {
            stmt.bindString(4, chatType);
        }
 
        String fromName = entity.getFromName();
        if (fromName != null) {
            stmt.bindString(5, fromName);
        }
 
        String fromAvatar = entity.getFromAvatar();
        if (fromAvatar != null) {
            stmt.bindString(6, fromAvatar);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(7, content);
        }
 
        String contentType = entity.getContentType();
        if (contentType != null) {
            stmt.bindString(8, contentType);
        }
 
        String audioLength = entity.getAudioLength();
        if (audioLength != null) {
            stmt.bindString(9, audioLength);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(10, time);
        }
        stmt.bindLong(11, entity.getIsRead() ? 1L: 0L);
        stmt.bindLong(12, entity.getMsgId());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Chat readEntity(Cursor cursor, int offset) {
        Chat entity = new Chat( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // fromId
            cursor.getInt(offset + 2), // toId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // chatType
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // fromName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // fromAvatar
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // content
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // contentType
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // audioLength
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // time
                cursor.getShort(offset + 10) != 0, // isRead
                cursor.getInt(offset + 11) // msgId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Chat entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFromId(cursor.getInt(offset + 1));
        entity.setToId(cursor.getInt(offset + 2));
        entity.setChatType(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFromName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFromAvatar(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setContent(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setContentType(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setAudioLength(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setTime(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setIsRead(cursor.getShort(offset + 10) != 0);
        entity.setMsgId(cursor.getInt(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Chat entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Chat entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Chat entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
