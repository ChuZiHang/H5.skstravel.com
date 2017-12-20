// -------------------------------------------------------------------------------------
// CMB Confidential
//
// Copyright (C) 2016.10.09 China Merchants Bank Co., Ltd. All rights reserved.
//
// No part of this file may be reproduced or transmitted in any form or by any
// means,
// electronic, mechanical, photocopying, recording, or otherwise, without prior
// written permission of China Merchants Bank Co., Ltd.
//
// -------------------------------------------------------------------------------------
package com.skstravel.common.api;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Utils {

    public static String getStackTrace(Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw, true);
        throwable.printStackTrace(pw);
        return sw.getBuffer().toString();
    }

}
