using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Muzzle : MonoBehaviour {
    public GameObject PreBullet;
    void Update() {
        if (Input.GetMouseButtonDown(0) == true) {
            GameObject bullet = Instantiate(PreBullet);
            bullet.transform.position = this.transform.position;
            Rigidbody rbody = bullet.GetComponent<Rigidbody>();
            rbody.AddForce(this.transform.forward * 1000);
        }
    }
}
