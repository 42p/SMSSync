/*******************************************************************************
 *  Copyright (c) 2010 - 2013 Ushahidi Inc
 *  All rights reserved
 *  Contact: team@ushahidi.com
 *  Website: http://www.ushahidi.com
 *  GNU Lesser General Public License Usage
 *  This file may be used under the terms of the GNU Lesser
 *  General Public License version 3 as published by the Free Software
 *  Foundation and appearing in the file LICENSE.LGPL included in the
 *  packaging of this file. Please review the following information to
 *  ensure the GNU Lesser General Public License version 3 requirements
 *  will be met: http://www.gnu.org/licenses/lgpl.html.
 *
 * If you have questions regarding the use of this file, please contact
 * Ushahidi developers at team@ushahidi.com.
 ******************************************************************************/

package org.addhen.smssync.database;

import nl.qbusict.cupboard.annotation.Column;

/**
 * Class to handle set and getters.
 *
 * @author eyedol
 */
public class Messages {

    @Column("messages_body")
    private String messageBody;

    @Column("messages_from")
    private String messageFrom;

    @Column("messages_date")
    private String messageDate;

    @Column("message_uuid")
    private String messageUuid;

    @Column("message_type")
    private Type messageType;

    @Column("sent_result_code")
    private int mSentResultCode;

    @Column("sent_result_message")
    private String mSentResultMessage;

    @Column("delivery_result_code")
    private int mDeliveryResultCode;

    @Column("delivery_result_message")
    private String mDeliveryResultMessage;

    @Column("retries")
    private int mRetries;

    @Column("status")
    private Status mStatus;

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(String messageFrom) {
        this.messageFrom = messageFrom;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessageUuid() {
        return messageUuid;
    }

    public void setMessageUuid(String messageUuid) {
        this.messageUuid = messageUuid;
    }

    public Type getMessageType() {
        return messageType;
    }

    public void setMessageType(Type messageType) {
        this.messageType = messageType;
    }

    public int getSentResultCode() {
        return mSentResultCode;
    }

    public void setSentResultCode(int sentResultCode) {
        mSentResultCode = sentResultCode;
    }

    public String getSentResultMessage() {
        return mSentResultMessage;
    }

    public void setSentResultMessage(String sentResultMessage) {
        mSentResultMessage = sentResultMessage;
    }

    public int getDeliveryResultCode() {
        return mDeliveryResultCode;
    }

    public void setDeliveryResultCode(int deliveryResultCode) {
        mDeliveryResultCode = deliveryResultCode;
    }

    public String getDeliveryResultMessage() {
        return mDeliveryResultMessage;
    }

    public void setDeliveryResultMessage(String deliveryResultMessage) {
        mDeliveryResultMessage = deliveryResultMessage;
    }

    public int getRetries() {
        return mRetries;
    }

    public void setRetries(int retries) {
        mRetries = retries;
    }

    public Status getStatus() {
        return mStatus;
    }

    public void setStatus(Status status) {
        mStatus = status;
    }

    public enum Status {
        UNCONFIRMED, FAILED, SENT;
    }

    public enum Type {
        TASK, PENDING;
    }
}
