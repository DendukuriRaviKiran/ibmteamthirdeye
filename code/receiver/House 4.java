var obtdata = global.get("globalval");
if(msg.payload=="Sender4")
{   msg.payload=parseInt(obtdata);
    return msg;
}

else
{
msg.payload=0;    
return msg;
}