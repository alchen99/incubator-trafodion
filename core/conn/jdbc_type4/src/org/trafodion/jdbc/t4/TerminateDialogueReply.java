// @@@ START COPYRIGHT @@@
//
// (C) Copyright 2003-2014 Hewlett-Packard Development Company, L.P.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//
// @@@ END COPYRIGHT @@@

package org.trafodion.jdbc.t4;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.UnsupportedCharsetException;
import java.sql.SQLException;

class TerminateDialogueReply {
	odbc_SQLSvc_TerminateDialogue_exc_ m_p1;

	// -------------------------------------------------------------
	TerminateDialogueReply(LogicalByteArray buf, String addr, InterfaceConnection ic) throws CharacterCodingException,
			UnsupportedCharsetException, SQLException {
		buf.setLocation(Header.sizeOf());

		m_p1 = new odbc_SQLSvc_TerminateDialogue_exc_();
		m_p1.extractFromByteArray(buf, addr, ic);
	}
}
