package cn.sp.rpc.common.protocol;

import cn.sp.rpc.util.SerializingUtil;

/**
 * Protobuf序列化协议
 * @author 2YSP
 * @date 2020/8/5 21:22
 */
public class ProtoBufMessageProtocol implements MessageProtocol{

    @Override
    public byte[] marshallingRequest(RpcRequest request) throws Exception {
        return SerializingUtil.serialize(request);
    }

    @Override
    public RpcRequest unmarshallingRequest(byte[] data) throws Exception {
        return SerializingUtil.deserialize(data,RpcRequest.class);
    }

    @Override
    public byte[] marshallingResponse(RpcResponse response) throws Exception {
        return SerializingUtil.serialize(response);
    }

    @Override
    public RpcResponse unmarshallingResponse(byte[] data) throws Exception {
        return SerializingUtil.deserialize(data,RpcResponse.class);
    }
}