package com.calance.util;

import com.calance.entity.Member;
import com.calance.helpers.Credentials;

public abstract interface IAuthenticator
{
  public abstract Member authenticate(Credentials paramCredentials);
}

