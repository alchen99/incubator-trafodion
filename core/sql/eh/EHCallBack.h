/**********************************************************************
// @@@ START COPYRIGHT @@@
//
// (C) Copyright 1995-2014 Hewlett-Packard Development Company, L.P.
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
**********************************************************************/
#ifndef _EH_CALL_BACK_H_
#define _EH_CALL_BACK_H_
/* -*-C++-*-
 *****************************************************************************
 *
 * File:         EHCallBack.cpp
 * Description:  Call back functions for exception handling
 *               
 *               
 * Created:      5/4/02
 * Language:     C++
 *
 *
 *
 *
 *****************************************************************************
 */
class EHCallBack {
public:
  virtual void doFFDC() = 0;
  virtual void dumpDiags() = 0;
};

#endif





